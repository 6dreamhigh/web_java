<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<script type = "text/javascript">
//switch
let score = prompt("당신의 점수? ");

switch(Math.floor(score/10)){
case 10:
case 9: grade ="A학점"; break;
case 8: grade ="B학점"; break;
case 7: grade ="C학점"; break;
case 6: grade ="D학점"; break;
default : grade ="F학점";
}

document.write("당신의 점수는 "+score+"점 이므로 "+grade+"입니다.");
//--------------------------------

let num = 85.9876543
console.log(num.toFixed(0));//86
console.log(num.toFixed(3));//85.988

var a = "1.7";
console.log(a+3);//결합 1.73
console.log(parseInt(a)+3);//반올림 안한다. -> 4
console.log(Math.floor(a)+3);//반올림 안한다. -> 4
console.log(Number(a)+3);//number는 숫자 그대로 바꾸라는 의미 ->4.7
console.log(~~(a)+ 3);//Math.floor(a)와 비슷, 4
</script>
</body>
</html>

<!-- 
Math.ceil() : 소수점 올림, 정수 반환
Math.floor() : 소수점 버림, 정수 반환
Math.round() : 소수점 반올림, 정수 반환
toFixed() : 숫자에서 원하는 소수점 길이만큼만 반올림하여서 반환

parseInt() : 문자 -> 정수     "123" -> 123
parseFloat() : 문자 -> 실수     "45.3" -> 45.3

Number() : 문자 -> 정수&실수
 -->