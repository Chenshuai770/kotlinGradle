package io;

import java.io.*;

public class TestIo {
    public static void main(String[] args) {
        //readline();
        //readBuffer();
        //readBuffer2();
        //wirterBuffer();
        //wirterLine();
        FileCharCopy();
        //FileBityCopy();

    }

    private static void readline() {
        BufferedReader bufferedReader = null;//字节输出流
        try {
            bufferedReader = new BufferedReader(new FileReader(new File("build.gradle")));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 从文件中读入数据1 不推荐使用这种方式
     */
    private static void readBuffer2() {
        BufferedInputStream bufferedInputStream = null;//字节输出流
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("build.gradle")));
            String context = null;
            //自定义一个缓存区
            byte[] buffer = new byte[1024];
            int flag = 0;
            while ((flag = bufferedInputStream.read(buffer)) != -1) {
                context += new String(buffer, 0, flag);

            }
            System.out.println(context);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 从文件中读入数据2
     */
    private static void readBuffer() {
        BufferedInputStream bufferedInputStream = null;//字节输出流
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("build.gradle")));

            StringBuilder stringBuilder = new StringBuilder();
            byte[] buffer = new byte[1024];
            int flag = 0;
            while ((flag = bufferedInputStream.read(buffer)) != -1) {
                stringBuilder.append(new String(buffer, 0, flag));

            }
            System.out.println(stringBuilder.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 从文件中写出数据
     */
    private static void wirterBuffer() {
        String content = "我是缓冲输出流测试数据！";
        BufferedOutputStream bos = null;//字节输出流
        try {
            bos = new BufferedOutputStream(new FileOutputStream(new File("FileOutputStream.txt")));
            bos.write(content.getBytes(), 0, content.getBytes().length);
            bos.flush();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /**
     * 从文件中写出数据
     */
    private static void wirterLine() {
        String content1 = "我是FileWriter输出流测试数据";
        BufferedWriter bw = null;//字节输出流
        try {
            bw = new BufferedWriter(new FileWriter(new File("FileWriter.txt")));
            bw.write(content1);
            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * FileReader读取
     */
    private static void FileReader() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File("custom.txt"));
            char[] chars = new char[1024];
            while (fileReader.read(chars) != -1) {
                System.out.println(new String(chars));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件从字符流copy
     */
    private static void FileCharCopy() {
        try {
            FileReader fr = new FileReader("custom.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("copyJava.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            int size = 0;
            char[] buffer = new char[1024];
            while ((size = br.read(buffer)) > -1) {
                bw.write(buffer, 0, size);
            }
            //刷新此缓冲的输出流，保证数据全部都能写出
            bw.flush();
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 文件从字节流copy
     */
    private static void FileBityCopy() {
        try {
            InputStream fis = new FileInputStream("custom.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            OutputStream fos = new FileOutputStream("copyJava.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int size = 0;
            byte[] buffer = new byte[1024];
            while ((size = bis.read(buffer)) > -1) {
                bos.write(buffer, 0, size);
            }
            //刷新此缓冲的输出流，保证数据全部都能写出
            bos.flush();
            bis.close();
            bos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
