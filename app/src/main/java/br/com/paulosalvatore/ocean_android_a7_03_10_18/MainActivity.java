package br.com.paulosalvatore.ocean_android_a7_03_10_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

	private DatabaseManager db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DatabaseHelper helper = new DatabaseHelper(this.getApplicationContext());
		DatabaseManager.inicializarInstancia(helper);
		db = DatabaseManager.getInstancia();

		db.limparPosicoes();

		Posicao posicao1 = new Posicao(-23.5566629, -46.7350831, "03/10/2018 20h21m");
		db.criarPosicao(posicao1);

		exibirPosicoes();

		List<Posicao> posicoes = db.obterPosicoes();

		Posicao posicaoAdicionada = posicoes.get(0);
		posicaoAdicionada.setDataHora("03/10/2018 20h36m");
		db.editarPosicao(posicaoAdicionada);

		exibirPosicoes();

		db.removerPosicao(posicaoAdicionada);

		exibirPosicoes();
	}

	private void exibirPosicoes() {
		Log.i("POSIÇÃO", "EXIBIR POSIÇÕES");

		List<Posicao> posicoes = db.obterPosicoes();

		for (Posicao posicao : posicoes) {
			int id = posicao.getId();
			double latitude = posicao.getLatitude();
			double longitude = posicao.getLongitude();
			String data_hora = posicao.getDataHora();

			Log.i("POSIÇÃO_ID", String.valueOf(id));
			Log.i("POSIÇÃO_LATITUDE", String.valueOf(latitude));
			Log.i("POSIÇÃO_LONGITUDE", String.valueOf(longitude));
			Log.i("POSIÇÃO_DATA_HORA", String.valueOf(data_hora));
		}
	}
}
