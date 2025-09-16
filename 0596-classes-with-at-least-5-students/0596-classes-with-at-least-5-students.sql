select class from Courses as c
group by class
having count(class)>= 5