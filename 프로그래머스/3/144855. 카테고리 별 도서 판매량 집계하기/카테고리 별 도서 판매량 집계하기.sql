-- 코드를 입력하세요
select a.CATEGORY, sum(b.SALES) TOTAL_SALES
from BOOK a,
    (
        SELECT *
        from BOOK_SALES
        where to_char(SALES_DATE, 'yyyy-mm') = '2022-01'
    ) b
where a.book_id = b.book_id
group by a.CATEGORY
order by a.CATEGORY


