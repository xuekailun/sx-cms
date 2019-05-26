package com.moon.utils;

import net.coobird.thumbnailator.Thumbnails;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 实现上传图片缩略图功能
 *
 */
public class ImageUtil {

    public void test(String filePath) throws IOException {
        File file = new File(filePath);
        /**
         * 指定大小进行缩放
         * 若图片横比200小，高比300小，不变
         * 若图片横比200小，高比300大，高缩小到300，图片比例不变
         * 若图片横比200大，高比300小，横缩小到200，图片比例不变
         * 若图片横比200大，高比300大，图片按比例缩小，横为200或高为300
         */
        Thumbnails.of(filePath)
                .size(200, 300)
                .toFile(file.getAbsolutePath() + "_200x300.jpg");

        Thumbnails.of(filePath)
                .scale(0.4f)
                .toFile(filePath);
        /**
         * 按照比例进行缩放
         * scale(比例)
         * */
        Thumbnails.of(filePath)
                .scale(0.25f)
                .toFile(file.getAbsolutePath() + "_25%.jpg");


        /**
         *  不按照比例，指定大小进行缩放
         *  keepAspectRatio(false) 默认是按照比例缩放的
         * */
        Thumbnails.of(filePath)
                .size(200, 200)
                .keepAspectRatio(false)
                .toFile(file.getAbsolutePath() + "_200x200.jpg");

        /**
         *  输出图片到流对象
         *
         * */
        OutputStream os = new FileOutputStream(file.getAbsolutePath() + "_OutputStream.png");
        Thumbnails.of(filePath)
                .size(1280, 1024)
                .toOutputStream(os);

        /**
         *  输出图片到BufferedImage
         * **/
        BufferedImage thumbnail = Thumbnails.of(filePath)
                .size(1280, 1024)
                .asBufferedImage();
        ImageIO.write(thumbnail, "jpg", new File(file.getAbsolutePath()+"_BufferedImage.jpg"));

    }


    public static void main(String[] args) {
        String filePath = "C:\\Users\\Moon\\Pictures\\Camera Roll\\1.png";

        try {
            Thumbnails.of(filePath)
                    .scale(0.4f)
                    .toFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
