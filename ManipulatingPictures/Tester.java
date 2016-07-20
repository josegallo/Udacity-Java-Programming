public class Tester
{
    public static void main(String[] args)
    {
        Picture Renoir = new Picture ("renoir1.jpg");
        Renoir.draw();
        Picture RenoirGray = PictureUtil.grayAndFlipLeftToRight(Renoir);
        RenoirGray.translate( Renoir.getWidth() + 10,  0);
        RenoirGray.draw();
        Picture Renoir2 = new Picture ("renoir1.jpg");
        Picture RenoirGray2 = PictureUtil.grayAndRotate90(Renoir2);
        RenoirGray2.translate( 2 * Renoir.getWidth() + 2* 10,  0);
        RenoirGray2.draw();
        
    }
}