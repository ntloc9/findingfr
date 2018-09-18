package locnguyen.com.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    var leagueClick = ""

    fun mensLeagueClicked(view: View){
        womansLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        leagueClick = "mens"
    }

    fun womansLeagueClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        leagueClick = "womans"
    }

    fun coedLeagueClicked(view: View){
        womansLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false

        leagueClick = "coed"
    }

    fun leagueNextClicked(view: View){
        if (leagueClick != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
