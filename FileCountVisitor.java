public class FileCountVisitor implements FileVisitor {

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
        return 1;
    }

    @Override
    public int visit(HtmlFileDetails htmlFileDetails) {
        return 1;
    }

    @Override
    public int visit(JpgFileDetails jpgFileDetails) {
       return 1;
    }

    @Override
    public int visit(Mp3FileDetails mp3FileDetails) {
       return 1;
    }

    @Override
    public int visit(PptxFileDetails pptxFileDetails) {
       return 1;
    }

    @Override
    public int visit(TxtFileDetails txtFileDetails) {
       return 1;
    }
    
}
