package IO;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ChangeObjectOutputStream extends ObjectOutputStream {
    public ChangeObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // 不写入序列化头
        reset();
    }
}
