public class FileShortRepVisitor implements FileVisitor {

    @Override
    public int visit(DirectoryDetails directoryDetails) {
        for (FileDetails file : directoryDetails)
        {
            file.accept(this);
        }
        System.out.println(directoryDetails.name);
        return 0;
    }

    @Override
    public int visit(DocxFileDetails docxFileDetails) {
        System.out.println(docxFileDetails.name);
        return 0;
    }

    @Override
    public int visit(HtmlFileDetails htmlFileDetails) {
        System.out.println(htmlFileDetails.name);
        return 0;
    }

    @Override
    public int visit(JpgFileDetails jpgFileDetails) {
        System.out.println(jpgFileDetails.name);
        return 0;
    }

    @Override
    public int visit(Mp3FileDetails mp3FileDetails) {
        System.out.println(mp3FileDetails.name);
        return 0;
    }

    @Override
    public int visit(PptxFileDetails pptxFileDetails) {
        System.out.println(pptxFileDetails.name);
        return 0;
    }

    @Override
    public int visit(TxtFileDetails txtFileDetails) {
        System.out.println(txtFileDetails.name);
        return 0;
    }
    
}
