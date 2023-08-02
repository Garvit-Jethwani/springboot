import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ServerResponse_setMsg_4b44a4d6f7_Test {

    @Test
    public void testSetMsg_Success() {
        ServerResponse response = new ServerResponse();
        response.setMsg("Success");

        assertEquals("Success", response.getMsg());
    }

    @Test
    public void testSetMsg_Null() {
        ServerResponse response = new ServerResponse();
        response.setMsg(null);

        assertEquals(null, response.getMsg());
    }
}

class ServerResponse {
    private String msg;

    public ServerResponse() {
        // Default constructor
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
