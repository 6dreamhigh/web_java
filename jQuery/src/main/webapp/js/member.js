$(function () {
    $('#join').submit(function () {
        var user_id = $('input[name="user_id"]').val();
        if(!user_id){
            alert('아이디 입력');
            $('input[name="user_id"]').focus();
            return false;
        }

        var user_pw = $('input[name="user_pw"]').val();
        if(!user_pw){
            alert('비밀번호 입력');
            $('input[name="user_pw"]').focus();
            return false;
        }

        var juminno = $('input[name="juminno"]').val();
        if(!juminno){
            alert('주민번호 입력');
            $('input[name="juminno"]').focus();
            return false;
        }

        if(!$('input[name="gender"]').is(':checked')){
            alert('성별 선택');
            
            // radio는 배열로 받는다
            // 여자에 자동 체크
            // 자바스크립트 방식
            //document.form1.gender[0].checked = true;

            // 제이쿼리 방식
            //$('input[name="gender"]:eq(0)').attr('checked', true);
            $('input[name="gender"]:eq(0)').prop('checked', true);

            return false;
        }

        var email = $('input[name="email"]').val();
        if(!email){
            alert('이메일 입력');
            $('input[name="email"]').focus();
            return false;
        }
        
        var url = $('input[name="url"]').val();
        if(!url){
            alert('URL 입력');
            $('input[name="url"]').focus();
            return false;
        }

        var hpno = $('input[name="hpno"]').val();
        if(!hpno){
            alert('휴대폰 번호 입력');
            $('input[name="hpno"]').focus();
            return false;
        }

        if(!$('input[name="hobby"]').is(':checked')){
            alert('취미 선택');
            $('input[name="hobby"]').focus();
            $('input[name="hobby"]:eq(0)').attr('checked', true);

            return false;
        }

        // 직업 '---선택하세요---'로 되어있을 때 (index가 0일 때)
        if($('select[name="job"] > option:selected').index() < 1){
            alert('직업 선택');
            $('select[name="job"] > option:eq(1)').attr('selected', true);

            return false;
        }

        // 입력한 내용 화면에 출력
        var gender = $('input[name="gender"]:checked').val();
        
        // 선택된 값들만 넘어온다
        var hobby = $('input[name="hobby"]:checked');
        var hobby_val = '';
        hobby.each(function () {            // .each() = jQuery의 for문
            //alert($(this).val())          // for문을 돌면서 선택된 값들 하나씩 불러오기 => this
            hobby_val += $(this).val();
            hobby_val += ' ';
        });

        var job = $('select[name="job"] > option:selected').val();

        var result = '<ul>';
        result += '<li>아이디: ' + user_id + '</li>';
        result += '<li>비밀번호: ' + user_pw + '</li>';
        result += '<li>주민번호: ' + juminno + '</li>';
        result += '<li>성별: ' + gender + '</li>';
        result += '<li>이메일: ' + email + '</li>';
        result += '<li>홈페이지: ' + url + '</li>';
        result += '<li>휴대폰: ' + hpno + '</li>';
        result += '<li>취미: ' + hobby_val + '</li>';
        result += '<li>직업: ' + job + '</li>';
        result += '</ul>';

        $('body').html(result);

        return false;
    });
});










