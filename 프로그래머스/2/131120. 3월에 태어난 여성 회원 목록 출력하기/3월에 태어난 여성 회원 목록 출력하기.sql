-- 코드를 입력하세요
SELECT member_id, member_name, gender, to_char(date_of_birth, 'yyyy-mm-dd') date_of_birth
from member_profile
where extract(MONTH from date_of_birth) = 3
and gender = 'W'
and not tlno is null
order by member_id
