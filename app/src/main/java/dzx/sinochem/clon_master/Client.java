package dzx.sinochem.clon_master;

/**
 * 作者： 敦志轩 on 2018/8/21.
 * 邮箱： 997681136@qq.com
 */
public class Client {

    public static void main(String[] main){
        WordDocument wordDocument = new WordDocument();
        wordDocument.setmText("11111111");
        wordDocument.addImage("图片1");
        wordDocument.addImage("图片2");
        wordDocument.addImage("图片3");
        wordDocument.showDocument();

        WordDocument wordDocument1 = (WordDocument) wordDocument.clone();
        wordDocument1.setmText("222222222222");
        wordDocument1.showDocument();
    }
}
