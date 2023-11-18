# AK42- Day 2
`List, Array, Object`
use: `Stream.class`

## ex1: int[] numbers = {1,4,5,7,9}
- viet chuong trinh tinh tong cua mang: `Arrays.stream(numbers).sum()`
- [search]: tim phan tu lon nhat `Arrays.stream(numbers).max()`
- [search]: tim phan tu be nhat `Arrays.stream(numbers).min()`
- [filter]: loc tat ca cac phan tu > 5 => `{7,9}`
- tim vi tri cua 2 phan tu trong mang, sao cho tong 2 phan tu do numbers[i] + numbers[j] = 5 ==> {i,j}

## ex2: Class Object
    - Tao cho anh 1 doi tuong Person
        - name: string
        - hair color: string random in  ["red","black","yellow","brown","blue"]
        - skin color: string randon in  ["yellow", "white", "black" ]
        - height: int random 50 - 190 cm
        - weight: int: ramdom 1 - 200 kg
        - year of birth: int random 1970 - 2023

    - Create 5 person 
    - tim nguoi lon tuoi nhat
    - nguoi cao nhat
    - nguoi nang nhat
    - nguoi co mau toc "black"
    - nguoi co mau gia "yellow"


## ex3: caro: tick tax toe
  |  |
--+--+--
  |  |  
--+--+--
  |  |


1 2 3
4 5 6
6 7 9
player choose 1-9
computer: choose random not the same chosen

player_chosen:
computer_chosen : 
winner who have chosen index in 
{[1,2,3], [4,5,6], [7,8,9], [1,4,6], [2,5,7], [3,6,9], [1,5,9] ,[3,5,6]}
defeated
draw

## ex4: Quiz Game
- include 10 questions
- 1 answer for each (A,B,C, D)
- sum total point of user exam Point/10
```
Q1. Thu do Viet Nam la gi?
  A) Ha Noi
  B) Ho Chi Minh
  C) Da Nang
  D) Hue
```
