package tn.esprit.pithepowerplayers.services;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pithepowerplayers.entities.Reservation;
import tn.esprit.pithepowerplayers.repositories.ReservationRepository;

import java.io.FileNotFoundException;
import java.util.List;


@Service
 @RequiredArgsConstructor
public class CreatePdfFileService {


    private final ReservationRepository reservationRepository;

    public void createPdf() {
        String filePdf = "C:/Users/eyama/OneDrive/Bureau/PdfFile/Reservation";

        List<Reservation> reservationList = reservationRepository.findAll();

        try {
            PdfWriter writer = new PdfWriter(filePdf);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);
            Paragraph p1 = new Paragraph("Reservation List");
            float[] columnWidth = {200f, 200f, 200f, 200f};
            Table table = new Table(columnWidth);
            table.addCell(new Cell().add("Id_Reservation"));
            table.addCell(new Cell().add("Amnout"));
            table.addCell(new Cell().add("Date_reservation"));
            table.addCell(new Cell().add("StatusReservation"));
            //table.addCell(new Cell().add("Typedepayment"));

            for (Reservation reservationData : reservationList) {
                table.addCell(new Cell().add(String.valueOf((reservationData.getId_Reservation()))));
                table.addCell(new Cell().add(String.valueOf(reservationData.getAmnout())));
                table.addCell(new Cell().add(String.valueOf(reservationData.getDate_Reservation())));
                table.addCell(new Cell().add(String.valueOf(reservationData.getStatusReservation())));
                //table.addCell(new Cell().add(String.valueOf(reservationData.getTypedepayment())));
            }

            document.add(p1);
            document.add(table);
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}



