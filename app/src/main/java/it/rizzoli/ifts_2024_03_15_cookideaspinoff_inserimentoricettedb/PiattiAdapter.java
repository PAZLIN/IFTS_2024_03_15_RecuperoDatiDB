    package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

    import android.content.Context;
    import android.graphics.Bitmap;
    import android.graphics.BitmapFactory;
    import android.os.AsyncTask;
    import android.util.Log;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ArrayAdapter;
    import android.widget.ImageView;
    import android.widget.ListView;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.annotation.Nullable;

    import java.io.InputStream;
    import java.util.List;

    public class PiattiAdapter extends ArrayAdapter <Piatto> {

        Context ctx = null;
        int res = 0;

        public PiattiAdapter (Context ctx, int res, List<Piatto> listaPiatti){
            super(ctx, res, listaPiatti);
            this.ctx=ctx;
            this.res=res;
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView==null)
                convertView= LayoutInflater.from(ctx).inflate(res, parent, false);
            Piatto piatto = getItem(position);

            Integer id = piatto.getId();
            Integer difficolta = piatto.getDifficolta();
            Integer tempo = piatto.getTempo();
            String nome_piatto = piatto.getNome_piatto();
            String provenienza = piatto.getProvenienza();
            String portata = piatto.getPortata();
            String procedimento = piatto.getProcedimento();
            String image_url = piatto.getImageUrl();
            List<Ricettario> ricettario = piatto.getRicettario();

            ((TextView) convertView.findViewById(R.id.row_act1_id)).setText(String.valueOf(id));
            ((TextView) convertView.findViewById(R.id.row_act1_difficolta)).setText(String.valueOf(difficolta));
            ((TextView) convertView.findViewById(R.id.row_act1_tempo)).setText(String.valueOf(tempo));
            ((TextView) convertView.findViewById(R.id.row_act1_nomepiatto)).setText(nome_piatto);
            ((TextView) convertView.findViewById(R.id.row_act1_provenienza)).setText(provenienza);
            ((TextView) convertView.findViewById(R.id.row_act1_portata)).setText(portata);
            ((TextView) convertView.findViewById(R.id.row_act1_procedimento)).setText(procedimento);
            ((TextView) convertView.findViewById(R.id.row_act1_url)).setText(image_url);

            ImageView imageView = convertView.findViewById(R.id.row_act1_imageurl);
            new DownloadImageTask(imageView).execute(image_url);

            ListView ricettarioListView = (ListView) convertView.findViewById(R.id.row_act1_Lw_Ingredienti);
            RicettarioAdapter ricettarioAdapter = new RicettarioAdapter(ctx, R.layout.act1_row1_row1_listaingredienti, piatto.getRicettario());
            ricettarioListView.setAdapter(ricettarioAdapter);

            return convertView;

        }


        private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
            ImageView imageView;

            public DownloadImageTask(ImageView imageView) {
                this.imageView = imageView;
            }

            protected Bitmap doInBackground(String... urls) {
                String imageUrl = urls[0];
                Bitmap bitmap = null;
                try {
                    InputStream in = new java.net.URL(imageUrl).openStream();
                    bitmap = BitmapFactory.decodeStream(in);
                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }
                return bitmap;
            }

            protected void onPostExecute(Bitmap result) {
                if (result != null) {
                    imageView.setImageBitmap(result);
                } else {
                    // Imposta un'immagine di fallback nel caso in cui il download abbia avuto esito negativo
                    imageView.setImageResource(R.drawable.ic_launcher_background);
                }
            }
        }




    } // end PiattoAdapter
