package dzx.sinochem.clon_master;

import java.util.ArrayList;

/**
 * 作者： 敦志轩 on 2018/8/21.
 * 邮箱： 997681136@qq.com
 */
public class WordDocument implements Cloneable {

    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument(){
        System.out.print("构造函数");
    }

    @Override
    protected Object clone(){
        WordDocument wordDocument = null;
        try {
            wordDocument = (WordDocument) super.clone();
            wordDocument.mText = this.mText;
            wordDocument.mImages = this.mImages;
            return wordDocument;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void addImage(String img){
        this.mImages.add(img);
    }

    public void showDocument(){
        System.out.print("\n"+"-----------word content start---------");
        System.out.print("\n"+"Text； " + mText);
        System.out.print("\n"+"ImageList:");
        for (String imageName : mImages){
            System.out.print("\n"+"image name :" + imageName);
        }
        System.out.print("\n"+"-----------word content end-----------");
    }
}
