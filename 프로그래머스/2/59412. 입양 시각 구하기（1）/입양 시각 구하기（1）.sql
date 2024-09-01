-- 코드를 입력하세요
SELECT to_number(to_char(DATETIME, 'HH24')) hour, count(*) count
from ANIMAL_OUTS 
where TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) between 9 and 19
group by to_char(DATETIME, 'HH24')
order by hour