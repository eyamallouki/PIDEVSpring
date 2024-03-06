package tn.esprit.pithepowerplayers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pithepowerplayers.services.CreatePdfFileService;

@RestController
public class PDFController {


    private CreatePdfFileService createPdfFileService;


    @Autowired
    public PDFController(CreatePdfFileService createPdfFileService) {
        this.createPdfFileService = createPdfFileService;
    }

    @GetMapping("/pdfFile")
    public String getPdf(){
        return "getPdfFile";
    }

    @GetMapping("/createPdf")
    public String pdfFile(){
        createPdfFileService.createPdf();
        return "redirect:/pdfFile";
    }
}
