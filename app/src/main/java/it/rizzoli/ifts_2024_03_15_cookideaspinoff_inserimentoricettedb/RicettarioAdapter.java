    package it.rizzoli.ifts_2024_03_15_cookideaspinoff_inserimentoricettedb;

    import android.content.Context;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ArrayAdapter;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.annotation.Nullable;

    import java.util.ArrayList;
    import java.util.List;

    public class RicettarioAdapter extends ArrayAdapter<Ricettario> {

        Context ctx = null;
        int res = 0;

        public RicettarioAdapter(Context ctx, int res, List<Ricettario> listaPiatti){
            super(ctx, res, listaPiatti);
            this.ctx=ctx;
            this.res=res;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView==null)
                convertView=LayoutInflater.from(ctx).inflate(res, parent, false);

            Ricettario r = getItem(position);
                ((TextView) convertView.findViewById(R.id.row_row_act1_ingrediente)).setText(r.getNome_ingrediente());
                ((TextView) convertView.findViewById(R.id.row_row_act1_quantita)).setText(String.valueOf(r.getQuantita_ingrediente()));


            return convertView;

        }
    }
