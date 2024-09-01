-- 코드를 입력하세요
SELECT name, count
from (
    select name, count(name) count
    from ANIMAL_INS
    where name is not null
    group by name
)
where count > 1

order by name