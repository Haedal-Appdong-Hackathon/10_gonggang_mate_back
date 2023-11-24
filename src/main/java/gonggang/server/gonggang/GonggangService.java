package gonggang.server.gonggang;

import gonggang.server.common.entity.Gonggang;
import gonggang.server.common.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GonggangService {

    private final GonggangRepository gonggangRepository;

    public GonggangDto getschedule(User user) {
        List<Gonggang> gonggangs = user.getGonggangs();
        GonggangDto contents = GonggangDto.toGonggangDto(gonggangs);
        return contents;
    }
}
