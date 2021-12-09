public interface FileVisitor {
    
    int visit(DirectoryDetails directoryFile);
    int visit(DocxFileDetails docxFile);
    int visit(HtmlFileDetails htmlFile);
    int visit(JpgFileDetails jpgFile);
    int visit(Mp3FileDetails mp3File);
    int visit(PptxFileDetails pptxFile);
    int visit(TxtFileDetails txtFile);
}