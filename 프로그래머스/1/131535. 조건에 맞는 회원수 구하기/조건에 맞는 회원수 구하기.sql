-- 코드를 입력하세요
SELECT count(user_id) users
from user_info
where extract(year from joined) = 2021
and age >= 20
and age <= 29