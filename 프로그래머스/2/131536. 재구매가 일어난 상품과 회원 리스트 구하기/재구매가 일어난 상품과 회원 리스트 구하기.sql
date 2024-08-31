-- 코드를 입력하세요
select user_id, product_id
from ONLINE_SALE
group by USER_ID, product_id
having count(online_sale_id) > 1
order by user_id, product_id desc