package gonggang.server.gonggang;

import gonggang.server.common.entity.Gonggang;
import lombok.*;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GonggangDto {

    private List<Gonggang> contents;

    public static GonggangDto toGonggangDto(List<Gonggang> gonggangs) {
        return GonggangDto.builder()
                .contents(gonggangs)
                .build();
    }
}
