# Advent of code 2020

Tasks from [advent of code 2020](https://adventofcode.com/2020)

<details>
<summary><b>Day 1</b></summary>

**Task:** Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.

**Solution:** Function [`findTwoEntriesForSum`](src/main/kotlin/com/rombe/advnt/of/code/year2020/day1/ReportParser.kt)
</details>

<details>
<summary><b>Day 2</b></summary>

**Task:** Each line gives the password policy and then the password. 
The password policy indicates the lowest and highest number of times a given letter must appear for the password to be valid. 
**How many passwords are valid?**

**Solution:** Simple extension function 
[`String.toPasswordPolicy`](src/main/kotlin/com/rombe/advnt/of/code/year2020/day2/PasswordPolicyParser.kt) for 
parsing password policy. For password validation by policy used property 
[`PasswordPolicy.isValid`](src/main/kotlin/com/rombe/advnt/of/code/year2020/day2/PasswordPolicy.kt)
</details>