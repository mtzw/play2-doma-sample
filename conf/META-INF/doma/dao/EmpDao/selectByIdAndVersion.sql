select
  id,
  emp_no,
  emp_name,
  mgr_id,
  hiredate,
  sal,
  dept_id,
  version_no
from
  emp
where
  id = /* id */1
  and
  version_no = /* versionNo */1
