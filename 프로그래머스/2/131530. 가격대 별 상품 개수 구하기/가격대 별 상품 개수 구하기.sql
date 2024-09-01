-- 코드를 입력하세요
SELECT (TRUNC(PRICE / 10000) * 10000) PRICE_GROUP, count(*) products
from product
group by TRUNC(PRICE / 10000)
order by PRICE_GROUP