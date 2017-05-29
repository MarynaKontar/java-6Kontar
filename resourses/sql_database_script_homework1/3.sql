-- 3. Вычислить общую ЗП всех Java разработчиков. 

use homework_1;

CREATE VIEW task3_Java_salaries AS
SELECT
  skills.*,
  sum(developers.DEVELOPER_SALARY) AS total_salary
FROM  
   developers INNER JOIN  developer_skill INNER JOIN  skills 
  ON 
  developers.DEVELOPER_ID = developer_skill.DEVELOPER_ID
  AND developer_skill.SKILL_ID = skills.SKILL_ID
WHERE skills.SKILL_NAME LIKE 'Java';
 
 
 #use homework_1;
#SELECT
 # skills.*,
#  sum(developers.DEVELOPER_SALARY) AS total_salary
#FROM  
 #  developers JOIN developer_skill ON developers.DEVELOPER_ID = developer_skill.DEVELOPER_ID
 # JOIN skills ON skills.SKILL_ID = developer_skill.SKILL_ID
#WHERE skills.SKILL_NAME LIKE 'Java';