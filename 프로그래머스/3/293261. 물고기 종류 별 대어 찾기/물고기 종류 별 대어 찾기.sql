-- 코드를 작성해주세요
select a.id, c.fish_name, b.length
from fish_info a, 
    (
        select FISH_TYPE, max(LENGTH) LENGTH
        from FISH_INFO 
        group by FISH_TYPE
    ) b, 
    fish_name_info c
where a.fish_type = b.fish_type
and b.fish_type = c.fish_type
and a.length = b.length
