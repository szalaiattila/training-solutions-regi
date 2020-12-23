package interfacemethods;

import java.time.LocalDateTime;

public interface Audited {

    LocalDateTime getCreatedAt();

    default boolean CreatedAfter(LocalDateTime dateTime) {
        return getCreatedAt().isAfter (dateTime);

    }

}
