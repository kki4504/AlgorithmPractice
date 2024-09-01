-- 코드를 입력하세요
SELECT MCDP_CD 진료과코드, count(PT_NO) 월예약건수
from APPOINTMENT
where to_char(APNT_YMD, 'yyyy-mm') = '2022-05'
group by MCDP_CD
order by 월예약건수, 진료과코드