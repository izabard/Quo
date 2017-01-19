package quo.quo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joel D. Jesus on 17/01/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.HeaderViewHolder> {


    List<Header> headers;

    public Adapter(List<Header> headers) {
        this.headers = headers;
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder{

        TextView txtHeader;
        TextView txtDescription;



        public HeaderViewHolder(View itemView) {
            super(itemView);
            txtHeader = (TextView) itemView.findViewById(R.id.txtTitulo);
            txtDescription = (TextView) itemView.findViewById(R.id.txtDescripcion);
        }
    }


    @Override
    public HeaderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        HeaderViewHolder header = new HeaderViewHolder(v);
        return header ;
    }



    @Override
    public void onBindViewHolder(HeaderViewHolder holder, int position) {
        holder.txtHeader.setText(headers.get(position).getTitulo());
        holder.txtDescription.setText(headers.get(position).getDescripcion());

    }

    @Override
    public int getItemCount() {
        return headers.size();
    }
}
