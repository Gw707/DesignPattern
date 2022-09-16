package com.gw.Builder;

/**
 *
 * TextBuilder.java
 * 实现text文本的建造
 *
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeString(String str) {
        buffer.append("=>" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        System.out.println("items:" );
        for (String item : items) {
            buffer.append(item + "+");
        }
        buffer.append("\n");
    }

    @Override
    public void makeTitle(String title) {
        buffer.append("================begin==============" + "\n");
        buffer.append("[" + title + "]" + "\n");
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("================end=================" + "\n");
        buffer.append("\n");
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
