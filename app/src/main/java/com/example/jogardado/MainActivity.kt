    package com.example.jogardado

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.Button
    import android.widget.ImageView
    import android.widget.TextView
    import android.widget.Toast

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //mostra imagem na tela, sem precisar teer jogado antes
            val imagem: ImageView = findViewById(R.id.imageView2)
            imagem.setImageResource(R.drawable.dice_1)

            //dando funcionalidade a um botão
            val botaoJogar: Button = findViewById(R.id.button)
            botaoJogar.setOnClickListener {

                //aqui eu coloco o que acontecerá após o clique usando nesse caso lambdas

                //Código para exibir pequena mensagem na parte inferior do aplicativo
//                val toast = Toast.makeText(this, "Dado jogado!", Toast.LENGTH_SHORT)
//                toast.show()

                //Código para gerar número aleatório
//                val resultadoDado: TextView = findViewById(R.id.textView)
//                resultadoDado.text = ((1..6).random()).toString()

            //reconhece a imageview e dá funcionalidade de rolar o dado para um numero aleatório
            val diceImage: ImageView = findViewById(R.id.imageView2)
              val  valorDado: Int = ((1..6).random())

                //variável recebe de acordo com a função random uma imagem para ser apresentada no app
                val desenharDado = when(valorDado){
                    1-> (R.drawable.dice_1)
                    2-> (R.drawable.dice_2)
                    3-> (R.drawable.dice_3)
                    4-> (R.drawable.dice_4)
                    5-> (R.drawable.dice_5)
                    else->(R.drawable.dice_6)
                    }
                //atualizaa a imagem do dado
                diceImage.setImageResource(desenharDado)



            }
        }
    }