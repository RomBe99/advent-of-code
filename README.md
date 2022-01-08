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

<details>
<summary><b>Day 3</b></summary>

**Task (first part):** Starting at the top-left corner of your map and following a slope of right 3 and down 1,
how many trees would you encounter?

**Task (second part):** Determine the number of trees you would encounter if, 
for each of the following slopes, you start at the top-left corner and traverse the map all the way to the bottom:

* Right 1, down 1.
* Right 3, down 1. (This direction already checked in first part)
* Right 5, down 1.
* Right 7, down 1.
* Right 1, down 2.

**What do you get if you multiply together the number of trees encountered on each of the listed slopes?**

**Solution:** Function [`findTreesAmount`](src/main/kotlin/com/rombe/advnt/of/code/year2020/day3/Navigation.kt).
For change navigation direction use class 
[`NavigationData`](src/main/kotlin/com/rombe/advnt/of/code/year2020/day3/NavigationData.kt)
</details>