package com.megaverkruzo.trendapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById<ListView>(R.id.game_list_view)

        val listItems = ArrayList<Game>()

        for (i in gameList.indices) {
            val game = gameList[i]
            listItems.add(game)
        }

        val adapter = GameAdapter(this, listItems)
        listView.adapter = adapter
    }
}

val gameList = arrayOf(
    Game(
        "Crash Bandicoot: со всех ног!",
        "https://play.google.com/store/apps/details?id=com.king.crash&hl=ru&gl=US",
        "Спаси Мультивселенную вместе с Крэшем Бандикутом и его сестрой Коко!\n" +
                "\n" +
                "Помоги Крэшу и Коко хорошенько пробежаться с препятствиями, которые нужно перепрыгнуть и разбить. Тебя ждут таинственные зоны и сражения с приспешниками доктора Нео Кортекса."
    ),
    Game(
        "Jelly Dye",
        "https://play.google.com/store/apps/details?id=com.game.colorslime",
        "Добавьте в желе цветные красители. Наслаждайтесь идеальными переливаниями. Простая механика, невероятные ощущения! Расслабляющий игровой процесс"
    ),
    Game(
        "Deep Clean Inc. 3D",
        "https://www.google.com/url?sa=t&source=web&rct=j&url=https://play.google.com/store/apps/details%3Fid%3Dcom.smo.deepcleaninc3d%26hl%3Dru%26gl%3DUS%26referrer%3Dutm_source%253Dgoogle%2526utm_medium%253Dorganic%2526utm_term%253Dclean%2Binc%2B3d%26pcampaignid%3DAPPU_1_sgbRYqDZOIrLrgTlvLTYBg&ved=2ahUKEwig-t7jn_r4AhWKpYsKHWUeDWsQ5YQBegQIAxAC&usg=AOvVaw1EdZXxEXbUWWGEnl01jxF4",
        "Очень приятный опыт уборки! Пожалуйста, станьте частью Deep Clean Inc. и начните делать грязные предметы достаточно чистыми и блестящими, чтобы удовлетворить ваших клиентов!"
    ),
    Game(
        "Girl Genius",
        "https://www.google.com/url?sa=t&source=web&rct=j&url=https://play.google.com/store/apps/details%3Fid%3Dcom.tgame.girlgenius%26hl%3Dru%26gl%3DUS%26referrer%3Dutm_source%253Dgoogle%2526utm_medium%253Dorganic%2526utm_term%253Dgirl%2Bgenius%26pcampaignid%3DAPPU_1_MAfRYo7JI8qRrgSSx66oBQ&ved=2ahUKEwiOodSfoPr4AhXKiIsKHZKjC1UQ5YQBegQIJRAC&usg=AOvVaw0lmeOyRHaF-e6BS-zhyGoE",
        "Ой-ой! Ты лучшая шпионка? Ты хорошо находишь улики и решаешь все головоломки? Если это так, есть идеально подходящая тебе игра!"
    ),
    Game(
        "Pencil Rush 3D",
        "https://play.google.com/store/apps/details?id=com.pencil.madness",
        "Пора добавить этому миру красок! Как считаешь? Открывай Pencil Rush 3D и поехали!"
    ),
    Game(
        "Real Drive 3D",
        "https://www.google.com/url?sa=t&source=web&rct=j&url=https://play.google.com/store/apps/details%3Fid%3Dcom.al.realdrive%26hl%3Dru%26gl%3DUS%26referrer%3Dutm_source%253Dgoogle%2526utm_medium%253Dorganic%2526utm_term%253Dreal%2Bdrive%2B3d%26pcampaignid%3DAPPU_1_vgfRYvqPJJX_rgThv6ygCw&ved=2ahUKEwj65q_joPr4AhWVv4sKHeEfC7QQ5YQBegQIBxAC&usg=AOvVaw0UMAsk84haB8mfGc8Nr0PV",
        "Готовы ли вы испытать уникальный игровой процесс вождения автомобиля? Начните со своего внедорожника и открывайте новые транспортные средства по мере прохождения игры, проходя различные и уникальные уровни. Управляйте своими любимыми транспортными средствами и прокладывайте свой путь в новых сложных условиях"
    ),
    Game(
        "Dodge master",
        "https://play.google.com/store/apps/details?id=com.twodestudios.dodgemaster",
        "Уклоняйся от пули, стреляй и убивай их всех в этой эпической игре-стрелялке! \n Забудьте обо всех других экшн-играх и приготовьтесь погрузиться в супер веселую битву с мафией, уклоняющейся и стреляющей! Убивать плохих парней еще никогда не было так весело!"
    ),
    Game(
        "Fail Run",
        "https://www.google.com/url?sa=t&source=web&rct=j&url=https://play.google.com/store/apps/details%3Fid%3Dcom.benjamind.failrun%26hl%3Dru%26gl%3DUS%26referrer%3Dutm_source%253Dgoogle%2526utm_medium%253Dorganic%2526utm_term%253Dfail%2Brun%2Bvoodoo%26pcampaignid%3DAPPU_1_AAnRYt3wAuGjrgT85b_gDA&ved=2ahUKEwjd8NP8ofr4AhXhkYsKHfzyD8wQ5YQBegQIDxAC&usg=AOvVaw1pLaDl62-XQfqjMBYu6CZS",
        "Прежде чем бежать, нужно научится ходить и споткнувшись пересечь финишную линию. Передвигайте одну ногу перед другой и постарайтесь не упасть."
    ),
    Game(
        "Z Escape",
        "https://play.google.com/store/apps/details?id=com.yorfstudio.sea",
        "Прикрывайте и спасайте граждан!\n" +
                "\n" +
                "Пришло время спасти ваших любимых от захватчиков! Готовы ли вы принять вызов?\n" +
                "\n" +
                "Запрыгивайте в свой вертолет, избавляясь по пути от всех врагов, и спасите как можно больше горожан! Но вы не сможете спасти всех, так что пусть окружающие предметы помогут вам... Вы к этому готовы? Есть только один способ узнать!"
    )
)