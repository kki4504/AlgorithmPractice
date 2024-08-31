-- 코드를 입력하세요
SELECT product_id, product_name, product_cd, category, price
from (select product_id, product_name, product_cd, category, price, dense_rank() over(order by price desc) rank from food_product)
where rank = 1