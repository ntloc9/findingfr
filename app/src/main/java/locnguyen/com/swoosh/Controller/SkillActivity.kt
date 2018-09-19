package locnguyen.com.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import locnguyen.com.swoosh.Model.Player
import locnguyen.com.swoosh.R
import locnguyen.com.swoosh.Utilities.EXTRA_PLAYER

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
    }

    fun beginerSkillClicked(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun ballerSkillClicked(view: View){
        beginerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun finishSkillClicked(view: View){
        if (player.skill != ""){
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this, "select one to continue", Toast.LENGTH_SHORT).show()
        }
    }
}
