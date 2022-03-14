package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberCond;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberCond cond);
    Page<MemberTeamDto> searchPageSimple(MemberCond cond, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberCond cond, Pageable pageable);
}
