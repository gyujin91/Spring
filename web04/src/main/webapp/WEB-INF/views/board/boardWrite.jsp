<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>글 등록</title>
    
    <style>
        .write_wrap {
            clear: both;
            width: 800px;
            position: relative;
            margin: auto 0;
           
        }
        
        input {
            height: 30px;
 
        }
        
        .btn1 {
            color: black;
        }
    </style>
</head>
<body>
    <div>
        <h2 style="text-align: center">글 등록</h2>
    </div>
    <div class="write_wrap">
        <div class="wirte">
            <form action="" method="post">
                <table>
                    <tr>
                        <th>제목</th>
                        <td><input type="text" name="title" placeholder="제목" required size="106"></td>
                    </tr>
                    <tr>
                        <th>작성자</th>
                        <td><input type="text" name="nickname" value="관리자" readonly size="106"></td>    
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td><textarea name="content" cols="100" rows="10" placeholder="내용"></textarea></td>
                    </tr>
                </table>
                <input type="submit" value="등록">
                <input type="submit" value="취소">
            </form>
        </div>
    </div>
      
</body>
</html>