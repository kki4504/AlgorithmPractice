-- 코드를 입력하세요





SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, r.review_score
from rest_info i, (
    select REST_ID, round(avg(nvl(REVIEW_SCORE, 0)), 2) REVIEW_SCORE
    from REST_REVIEW 
    group by rest_id
) r
where i.rest_id = r.rest_id
and i.address like '서울%'
order by r.review_score desc, i.favorites desc