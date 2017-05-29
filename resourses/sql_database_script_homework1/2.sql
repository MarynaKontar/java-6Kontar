-- 2. Найти самый дорогой проект (исходя из ЗП разработчиков).

USE homework_1;
CREATE VIEW task2_projects_salaries AS
SELECT
  projects.PROJECT_ID,
  projects.PROJECT_NAME,
  sum(developers.DEVELOPER_SALARY) sum_salary
FROM 
  developers INNER JOIN  developer_project INNER JOIN  projects 
  ON 
  developers.DEVELOPER_ID=developer_project.DEVELOPER_ID
  AND 
  developer_project.PROJECT_ID=projects.PROJECT_ID 
                   
 GROUP BY projects.PROJECT_ID
 ORDER BY sum_salary DESC
 -- LIMIT 1;
;	


