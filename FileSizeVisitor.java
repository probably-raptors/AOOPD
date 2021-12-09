public class FileSizeVisitor implements FileVisitor {

    @Override
    public int visit(DirectoryDetails directoryDetails) {
        int count = 0;
        for (FileDetails file : directoryDetails)
        {
            count += file.accept(this);
        }
        return count;
    }

    @Override
    public int visit(DocxFileDetails docxFileDetails) {
        return docxFileDetails.getSize();
    }

    @Override
    public int visit(HtmlFileDetails htmlFileDetails) {
        return htmlFileDetails.getSize();
    }

    @Override
    public int visit(JpgFileDetails jpgFileDetails) {
       return jpgFileDetails.getSize();
    }

    @Override
    public int visit(Mp3FileDetails mp3FileDetails) {
       return mp3FileDetails.getSize();
    }

    @Override
    public int visit(PptxFileDetails pptxFileDetails) {
       return pptxFileDetails.getSize();
    }

    @Override
    public int visit(TxtFileDetails txtFileDetails) {
       return txtFileDetails.getSize();
    }
    
}
