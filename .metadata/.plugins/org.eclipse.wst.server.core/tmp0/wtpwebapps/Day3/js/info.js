function sendit() {
   const form = document.regform;
   const userpw = form.userpw;
   const userpw_re = form.userpw_re;
   const name = form.name;
   const hp = form.hp;
   const email = form.email;
   const hobby = form.hobby;
   const isssn = form.isssn;
   const isidcheck = form.isidcheck
   // const hobby = document.getElementsByName('hobby');

   // 정규식
   const expNameText = /[가-힣]+$/;
   const expHpText = /^\d{3}-\d{3,4}-\d{4}$/;
   const expEmailText = /^[A-Za-z0-9\-\.]+@[A-Za-z0-9\.\-]+\.[A-Za-z0-9]+$/; // 무조건 붙여써야됨


   if (!expNameText.test(name.value)) {
      alert("이름 형식을 확인하세요\n한글만 입력 가능합니다.");
      name.focus();
      return false;
   }
   if (!expHpText.test(hp.value)) {
      alert("휴대폰번호 형식을 확인하세요\n하이픈(-)을 포함해야 합니다");
      hp.focus();
      return false;
   }
   if (!expEmailText.test(email.value)) {
      alert("이메일 형식을 확인하세요");
      email.focus();
      return false;
   }

   let count = 0;

   for (let i in hobby) if (hobby[i].checked) count++;

   if (count == 0) {
      alert("취미는 적어도 1개이상 선택하세요");
      return false;
   }

   if (isssn.value == "n") {
      alert("주민등록번호 검증버튼을 눌러주세요");
   }

   return true;
}


$(function() {
      const xhr = new XMLHttpRequest();
      const userid = $('#userid').val();
      xhr.open('GET', '2_member_idcheck.jsp?userid='+userid, true);
      xhr.send();

      xhr.onreadystatechange = function(){
         if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
            const result = xhr.responseText;
            if(result.trim() == "ok"){
               $('#idcheckmsg').html("<b style='color: blue'>가입이 가능합니다.</b>");
            }else{
               $('#idcheckmsg').html("<b style='color: red'>중복된 아이디가 있습니다.</b>");
            }
         }
      }
   });

