package com.sanjit49.avitiens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class categoricheck extends AppCompatActivity {
    private ImageView imageView2, imageView3, imageView4, imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoricheck);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);

        String str = getIntent().getStringExtra("ind");
        // north- monday
        if (str.equals("north1")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner");
                    startActivity(intent);
                }
            });
        }
        // north- tuesday
        else if (str.equals("north2")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break2");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch2");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack2");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner2");
                    startActivity(intent);
                }
            });
        }
        // north- wednesday
        else if (str.equals("north3")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break3");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch3");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack3");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner3");
                    startActivity(intent);
                }
            });
        }
        // north- thursday
        else if (str.equals("north4")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break4");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch4");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack4");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner4");
                    startActivity(intent);
                }
            });
        }
        // north- friday
        else if (str.equals("north5")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break5");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch5");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack5");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner5");
                    startActivity(intent);
                }
            });
        }
        // north- saturday
        else if (str.equals("north6")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break6");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch6");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack6");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner6");
                    startActivity(intent);
                }
            });
        }
        // north- sunday
        else if (str.equals("north7")) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "break7");
                    startActivity(intent);
                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "lunch7");
                    startActivity(intent);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "snack7");
                    startActivity(intent);
                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(categoricheck.this, messview.class);
                    intent.putExtra("text", "dinner7");
                    startActivity(intent);
                }
            });
        }


        // for south
        else if (str.equals("south1")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break11");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch11");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack11");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner11");
                        startActivity(intent);
                    }
                });
            }
        }
        else if (str.equals("south2")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break22");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch22");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack22");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner22");
                        startActivity(intent);
                    }
                });
            }
        }
        else if (str.equals("south3")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break33");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch33");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack33");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner33");
                        startActivity(intent);
                    }
                });
            }
        }
        else if (str.equals("south4")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break44");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch44");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack44");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner44");
                        startActivity(intent);
                    }
                });
            }
        }
        else if (str.equals("south5")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break55");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch55");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack55");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner55");
                        startActivity(intent);
                    }
                });
            }
        }
        else if (str.equals("south6")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break66");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch66");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack66");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner66");
                        startActivity(intent);
                    }
                });
            }
        }
        else if (str.equals("south7")) {
            {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "break77");
                        startActivity(intent);
                    }
                });
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "lunch77");
                        startActivity(intent);
                    }
                });
                imageView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "snack77");
                        startActivity(intent);
                    }
                });
                imageView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(categoricheck.this, messview.class);
                        intent.putExtra("text", "dinner77");
                        startActivity(intent);
                    }
                });
            }
        }

    }
}