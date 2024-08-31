select to_char(sales_date, 'yyyy-mm-dd') sales_date, product_id, nvl(user_id, null) user_id, sales_amount
from online_sale
where to_char(SALES_DATE, 'yyyy-mm') = '2022-03'

union

select to_char(sales_date, 'yyyy-mm-dd') sales_date, product_id, NULL AS USER_ID, sales_amount
from offline_sale
where to_char(SALES_DATE, 'yyyy-mm') = '2022-03'
order by sales_date