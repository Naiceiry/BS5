package BS5.Logging.en.Spring.Boot.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class log {
    String logers;
    public void mensajes(){;
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn ");
        log.error("error");
    }
}
