public class FileStatsVisitor implements FileVisitor {

    @Override
    public int visit(DirectoryDetails directoryDetails) {
        for (FileDetails file : directoryDetails)
        {
            file.accept(this);
        }
        System.out.printf("Directory %s has %d files.\n",
            directoryDetails.getName(), directoryDetails.accept(new FileCountVisitor()));
            return 0;
    }

    @Override
    public int visit(DocxFileDetails docxFileDetails) {
        System.out.printf("The file %s has an average of %.6f words per page.\n",
            docxFileDetails.name, (float) docxFileDetails.getWords()/docxFileDetails.getPages());
        return 0;
    }

    @Override
    public int visit(HtmlFileDetails htmlFileDetails) {
        System.out.printf("The file %s contains %d lines.\n",
            htmlFileDetails.name, htmlFileDetails.getLines());
            return 0;
    }

    @Override
    public int visit(JpgFileDetails jpgFileDetails) {
       System.out.printf("The picture %s has an average of %.6f bytes per pixel.\n",
            jpgFileDetails.name,(float) jpgFileDetails.getSize()/(jpgFileDetails.getWidth()*jpgFileDetails.getHeight()));
            return 0;
    }

    @Override
    public int visit(Mp3FileDetails mp3FileDetails) {
       System.out.printf("The bitrate of %s is %.6f bytes per second.\n",
            mp3FileDetails.name, (float) mp3FileDetails.getSize()/mp3FileDetails.getLengthSec());
            return 0;
    }

    @Override
    public int visit(PptxFileDetails pptxFileDetails) {
       System.out.printf("The average slide size in Presentation %s is %.6f.\n",
            pptxFileDetails.name, (float) pptxFileDetails.getSize()/pptxFileDetails.getSlides());
            return 0;
    }

    @Override
    public int visit(TxtFileDetails txtFileDetails) {
       System.out.printf("The file %s contains %d words.\n", 
            txtFileDetails.name, txtFileDetails.getWords());
            return 0;
    }
    
}
