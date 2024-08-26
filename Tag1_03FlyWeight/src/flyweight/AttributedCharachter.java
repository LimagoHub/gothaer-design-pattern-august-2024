package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharachter {

    private static final List<AttributedCharachter> charachters = new ArrayList<AttributedCharachter>();

    private final char c;
    private final boolean bold;

    private AttributedCharachter(final char c, final boolean bold) {
        this.c = c;
        this.bold = bold;
        charachters.add(this);
    }

    public static AttributedCharachter getAttributedCharachter(final char c, final boolean bold) {
        for (int i = 0; i < charachters.size(); i++) {
            if(charachters.get(i).c == c && charachters.get(i).bold == bold) {
                return charachters.get(i);
            }
        }

        return new AttributedCharachter(c, bold);
    }

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AttributedCharachter{");
        sb.append("c=").append(c);
        sb.append(", bold=").append(bold);
        sb.append('}');
        return sb.toString();
    }
}
