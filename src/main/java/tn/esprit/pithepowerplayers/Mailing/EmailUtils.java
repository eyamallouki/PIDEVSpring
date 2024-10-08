package tn.esprit.pithepowerplayers.Mailing;

public class EmailUtils {
    //hedheya page html bech tetb3ath fel mail
    public static String htmlMailExemple(){
        return "<html xmlns:v=\"urn:schemas-microsoft-com:vml\"><head>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0; maximum-scale=1.0;\">\n" +
                "    <!--[if !mso]--><!-- -->\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Work+Sans:300,400,500,600,700\" rel=\"stylesheet\">\n" +
                "    <link href=\"https://fonts.googleapis.com/css?family=Quicksand:300,400,700\" rel=\"stylesheet\">\n" +
                "    <!-- <![endif]-->\n" +
                "\n" +
                "    <title>Material Design for Bootstrap</title>\n" +
                "\n" +
                "    <style type=\"text/css\">\n" +
                "        body {\n" +
                "            width: 100%;\n" +
                "            background-color: #ffffff;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            -webkit-font-smoothing: antialiased;\n" +
                "            mso-margin-top-alt: 0px;\n" +
                "            mso-margin-bottom-alt: 0px;\n" +
                "            mso-padding-alt: 0px 0px 0px 0px;\n" +
                "        }\n" +
                "        \n" +
                "        p,\n" +
                "        h1,\n" +
                "        h2,\n" +
                "        h3,\n" +
                "        h4 {\n" +
                "            margin-top: 0;\n" +
                "            margin-bottom: 0;\n" +
                "            padding-top: 0;\n" +
                "            padding-bottom: 0;\n" +
                "        }\n" +
                "        \n" +
                "        span.preheader {\n" +
                "            display: none;\n" +
                "            font-size: 1px;\n" +
                "        }\n" +
                "        \n" +
                "        html {\n" +
                "            width: 100%;\n" +
                "        }\n" +
                "        \n" +
                "        table {\n" +
                "            font-size: 14px;\n" +
                "            border: 0;\n" +
                "        }\n" +
                "        /* ----------- responsivity ----------- */\n" +
                "        \n" +
                "        @media only screen and (max-width: 640px) {\n" +
                "            /*------ top header ------ */\n" +
                "            .main-header {\n" +
                "                font-size: 20px !important;\n" +
                "            }\n" +
                "            .main-section-header {\n" +
                "                font-size: 28px !important;\n" +
                "            }\n" +
                "            .show {\n" +
                "                display: block !important;\n" +
                "            }\n" +
                "            .hide {\n" +
                "                display: none !important;\n" +
                "            }\n" +
                "            .align-center {\n" +
                "                text-align: center !important;\n" +
                "            }\n" +
                "            .no-bg {\n" +
                "                background: none !important;\n" +
                "            }\n" +
                "            /*----- main image -------*/\n" +
                "            .main-image img {\n" +
                "                width: 440px !important;\n" +
                "                height: auto !important;\n" +
                "            }\n" +
                "            /* ====== divider ====== */\n" +
                "            .divider img {\n" +
                "                width: 440px !important;\n" +
                "            }\n" +
                "            /*-------- container --------*/\n" +
                "            .container590 {\n" +
                "                width: 440px !important;\n" +
                "            }\n" +
                "            .container580 {\n" +
                "                width: 400px !important;\n" +
                "            }\n" +
                "            .main-button {\n" +
                "                width: 220px !important;\n" +
                "            }\n" +
                "            /*-------- secions ----------*/\n" +
                "            .section-img img {\n" +
                "                width: 320px !important;\n" +
                "                height: auto !important;\n" +
                "            }\n" +
                "            .team-img img {\n" +
                "                width: 100% !important;\n" +
                "                height: auto !important;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        @media only screen and (max-width: 479px) {\n" +
                "            /*------ top header ------ */\n" +
                "            .main-header {\n" +
                "                font-size: 18px !important;\n" +
                "            }\n" +
                "            .main-section-header {\n" +
                "                font-size: 26px !important;\n" +
                "            }\n" +
                "            /* ====== divider ====== */\n" +
                "            .divider img {\n" +
                "                width: 280px !important;\n" +
                "            }\n" +
                "            /*-------- container --------*/\n" +
                "            .container590 {\n" +
                "                width: 280px !important;\n" +
                "            }\n" +
                "            .container590 {\n" +
                "                width: 280px !important;\n" +
                "            }\n" +
                "            .container580 {\n" +
                "                width: 260px !important;\n" +
                "            }\n" +
                "            /*-------- secions ----------*/\n" +
                "            .section-img img {\n" +
                "                width: 280px !important;\n" +
                "                height: auto !important;\n" +
                "            }\n" +
                "        }\n" +
                "    </style>\n" +
                "    <!-- [if gte mso 9]><style type=”text/css”>\n" +
                "        body {\n" +
                "        font-family: arial, sans-serif!important;\n" +
                "        }\n" +
                "        </style>\n" +
                "    <![endif]-->\n" +
                "</head>\n" +
                "\n" +
                "\n" +
                "<body class=\"respond\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\n" +
                "    <!-- pre-header -->\n" +
                "    <table style=\"display:none!important;\">\n" +
                "        <tbody><tr>\n" +
                "            <td>\n" +
                "                <div style=\"overflow:hidden;display:none;font-size:1px;color:#ffffff;line-height:1px;font-family:Arial;maxheight:0px;max-width:0px;opacity:0;\">\n" +
                "                    Pre-header for the newsletter template\n" +
                "                </div>\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </tbody></table>\n" +
                "    <!-- pre-header end -->\n" +
                "    <!-- header -->\n" +
                "    <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"ffffff\">\n" +
                "\n" +
                "        <tbody><tr>\n" +
                "            <td align=\"center\">\n" +
                "                <table border=\"0\" align=\"center\" width=\"590\" cellpadding=\"0\" cellspacing=\"0\" class=\"container590\">\n" +
                "\n" +
                "                    <tbody><tr>\n" +
                "                        <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\">\n" +
                "\n" +
                "                            <table border=\"0\" align=\"center\" width=\"590\" cellpadding=\"0\" cellspacing=\"0\" class=\"container590\">\n" +
                "\n" +
                "                              </table>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                </tbody></table>\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "    </tbody></table>\n" +
                "    <!-- end header -->\n" +
                "\n" +
                "    <!-- big image section -->\n" +
                "    <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"ffffff\" class=\"bg_color\">\n" +
                "\n" +
                "        <tbody><tr>\n" +
                "            <td align=\"center\">\n" +
                "                <table border=\"0\" align=\"center\" width=\"590\" cellpadding=\"0\" cellspacing=\"0\" class=\"container590\">\n" +
                "                    <tbody><tr>\n" +
                "\n" +
                "                        <td align=\"center\" class=\"section-img\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                        <td height=\"20\" style=\"font-size: 20px; line-height: 20px;\">&nbsp;</td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\" style=\"color: #343434; font-size: 24px; font-family: Quicksand, Calibri, sans-serif; font-weight:700;letter-spacing: 3px; line-height: 35px;\" class=\"main-header\">\n" +
                "\n" +
                "\n" +
                "                            <div style=\"line-height: 35px\">\n" +
                "\n" +
                "                                NEW RECLAMATION" +
                "\n" +
                "                            </div>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td height=\"10\" style=\"font-size: 10px; line-height: 10px;\">&nbsp;</td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\">\n" +
                "                            <table border=\"0\" width=\"40\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"eeeeee\">\n" +
                "                                <tbody><tr>\n" +
                "                                    <td height=\"2\" style=\"font-size: 2px; line-height: 2px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "                            </tbody></table>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td height=\"20\" style=\"font-size: 20px; line-height: 20px;\">&nbsp;</td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\">\n" +
                "                            <table border=\"0\" width=\"400\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" class=\"container590\">\n" +
                "                                <tbody><tr>\n" +
                "                                    <td align=\"center\" style=\"color: #888888; font-size: 16px; font-family: 'Work Sans', Calibri, sans-serif; line-height: 24px;\">\n" +
                "\n" +
                "\n" +
                "                                        <div style=\"line-height: 24px\">\n" +
                "\n" +
                "                                          You received a new reclamation for more details tap here.\n" +
                "                                        </div>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </tbody></table>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                    <tr>\n" +
                "                        <td align=\"center\">\n" +
                "                            <table border=\"0\" align=\"center\" width=\"160\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"5caad2\" style=\"\">\n" +
                "\n" +
                "                                <tbody><tr>\n" +
                "                                    <td height=\"10\" style=\"font-size: 10px; line-height: 10px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td align=\"center\" style=\"color: #ffffff; font-size: 14px; font-family: 'Work Sans', Calibri, sans-serif; line-height: 26px;\">\n" +
                "\n" +
                "\n" +
                "                                        <div style=\"line-height: 26px;\">\n" +
                "                                            <a href=\"\" style=\"color: #ffffff; text-decoration: none;\">Read More</a>\n" +
                "                                        </div>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td height=\"10\" style=\"font-size: 10px; line-height: 10px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                            </tbody></table>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "\n" +
                "                </tbody></table>\n" +
                "\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "\n" +
                "    </tbody></table>\n" +
                "    <!-- end section -->\n" +
                "\n" +
                "    <!-- contact section -->\n" +
                "    <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"ffffff\" class=\"bg_color\">\n" +
                "\n" +
                "        <tbody><tr class=\"hide\">\n" +
                "            <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "            <td height=\"40\" style=\"font-size: 40px; line-height: 40px;\">&nbsp;</td>\n" +
                "        </tr>\n" +
                "\n" +
                "        <tr>\n" +
                "            <td height=\"60\" style=\"border-top: 1px solid #e0e0e0;font-size: 60px; line-height: 60px;\">&nbsp;</td>\n" +
                "        </tr>\n" +
                "\n" +
                "        <tr>\n" +
                "            <td align=\"center\">\n" +
                "                <table border=\"0\" align=\"center\" width=\"590\" cellpadding=\"0\" cellspacing=\"0\" class=\"container590 bg_color\">\n" +
                "\n" +
                "                    <tbody><tr>\n" +
                "                        <td>\n" +
                "                            <table border=\"0\" width=\"300\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\" class=\"container590\">\n" +
                "\n" +
                "                                <tbody><tr>\n" +
                "                                    <!-- logo -->\n" +
                "                                    <td align=\"left\">\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td align=\"left\" style=\"color: #888888; font-size: 14px; font-family: 'Work Sans', Calibri, sans-serif; line-height: 23px;\" class=\"text_color\">\n" +
                "                                        <div style=\"color: #333333; font-size: 14px; font-family: 'Work Sans', Calibri, sans-serif; font-weight: 600; mso-line-height-rule: exactly; line-height: 23px;\">\n" +
                "\n" +
                "                                            Email us: <br> <a href=\"mailto:\" style=\"color: #888888; font-size: 14px; font-family: 'Hind Siliguri', Calibri, Sans-serif; font-weight: 400;\">contact@mdbootstrap.com</a>\n" +
                "\n" +
                "                                        </div>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                            </tbody></table>\n" +
                "\n" +
                "                            <table border=\"0\" width=\"2\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\" class=\"container590\">\n" +
                "                                <tbody><tr>\n" +
                "                                    <td width=\"2\" height=\"10\" style=\"font-size: 10px; line-height: 10px;\"></td>\n" +
                "                                </tr>\n" +
                "                            </tbody></table>\n" +
                "\n" +
                "                            <table border=\"0\" width=\"200\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\" class=\"container590\">\n" +
                "\n" +
                "                                <tbody><tr>\n" +
                "                                    <td class=\"hide\" height=\"45\" style=\"font-size: 45px; line-height: 45px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td height=\"15\" style=\"font-size: 15px; line-height: 15px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                                <tr>\n" +
                "                                    <td>\n" +
                "                                        <table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "                                            </table>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                            </tbody></table>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                </tbody></table>\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "\n" +
                "        <tr>\n" +
                "            <td height=\"60\" style=\"font-size: 60px; line-height: 60px;\">&nbsp;</td>\n" +
                "        </tr>\n" +
                "\n" +
                "    </tbody></table>\n" +
                "    <!-- end section -->\n" +
                "\n" +
                "    <!-- footer ====== -->\n" +
                "    <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"f4f4f4\">\n" +
                "\n" +
                "        <tbody><tr>\n" +
                "            <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "        </tr>\n" +
                "\n" +
                "        <tr>\n" +
                "            <td align=\"center\">\n" +
                "\n" +
                "                <table border=\"0\" align=\"center\" width=\"590\" cellpadding=\"0\" cellspacing=\"0\" class=\"container590\">\n" +
                "\n" +
                "                    <tbody><tr>\n" +
                "                        <td>\n" +
                "                            <table border=\"0\" align=\"left\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\" class=\"container590\">\n" +
                "                                <tbody><tr>\n" +
                "                                    <td align=\"left\" style=\"color: #aaaaaa; font-size: 14px; font-family: 'Work Sans', Calibri, sans-serif; line-height: 24px;\">\n" +
                "                                        <div style=\"line-height: 24px;\">\n" +
                "\n" +
                "                                            <span style=\"color: #333333;\">Material Design for Bootstrap</span>\n" +
                "\n" +
                "                                        </div>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "                            </tbody></table>\n" +
                "\n" +
                "                            <table border=\"0\" align=\"left\" width=\"5\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\" class=\"container590\">\n" +
                "                                <tbody><tr>\n" +
                "                                    <td height=\"20\" width=\"5\" style=\"font-size: 20px; line-height: 20px;\">&nbsp;</td>\n" +
                "                                </tr>\n" +
                "                            </tbody></table>\n" +
                "\n" +
                "                            <table border=\"0\" align=\"right\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; mso-table-lspace:0pt; mso-table-rspace:0pt;\" class=\"container590\">\n" +
                "\n" +
                "                                <tbody><tr>\n" +
                "                                    <td align=\"center\">\n" +
                "                                        <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
                "                                            <tbody><tr>\n" +
                "                                                <td align=\"center\">\n" +
                "                                                    <a style=\"font-size: 14px; font-family: 'Work Sans', Calibri, sans-serif; line-height: 24px;color: #5caad2; text-decoration: none;font-weight:bold;\" href=\"{{UnsubscribeURL}}\">UNSUBSCRIBE</a>\n" +
                "                                                </td>\n" +
                "                                            </tr>\n" +
                "                                        </tbody></table>\n" +
                "                                    </td>\n" +
                "                                </tr>\n" +
                "\n" +
                "                            </tbody></table>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "\n" +
                "                </tbody></table>\n" +
                "            </td>\n" +
                "        </tr>\n" +
                "\n" +
                "        <tr>\n" +
                "            <td height=\"25\" style=\"font-size: 25px; line-height: 25px;\">&nbsp;</td>\n" +
                "        </tr>\n" +
                "\n" +
                "    </tbody></table>\n" +
                "    <!-- end footer ====== -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body></html>";
    }

}
