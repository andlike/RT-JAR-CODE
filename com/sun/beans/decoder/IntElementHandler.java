package com.sun.beans.decoder;

final class IntElementHandler extends StringElementHandler {
    public Object getValue(String paramString) {
        return Integer.decode(paramString);
    }
}

/* Location:           C:\Program Files\Java\jdk1.7.0_79\jre\lib\rt.jar
 * Qualified Name:     com.sun.beans.decoder.IntElementHandler
 * JD-Core Version:    0.6.2
 */