let header = `
        <div>
        <img class="logo-img" src="/WORKSYSTEM/images/worklogo2.png"/>
        </div>`;

let aside = `
    <div class="nav-div">
        <nav>
            <ul class="list-group">
                <li class="list-group-item"  onclick="triggerClick('1')">工作记录</li>
                <li class="list-group-item" onclick="triggerClick('2')">周报</li>      
            </ul>
        </nav>
    
</div>
    <div class="contact-me">
         <div>
                <div><img src="../images/2D.gif" class="QR-img"></div>
         </div>
    </div>`;
let footer = `
    <p><a href="https://blog.csdn.net/qq_34312317 " class="common-a">制作人：刘政平</a></p>
    |
    <p>邮箱：1757266829@qq.com</p>
    |
    <p>QQ：1757266829</p>
`;

function triggerClick(flag) {
    if (flag == '1') {
        window.location = '../html/workRecord.html'
    }
    if (flag == '2') {
        window.location = '../html/staffMain.html'
    }
}


$(() => {
    $('aside').append(aside);
    $('header').append(header);
    $('footer').append(footer);
});